package com.green.database;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//Data Access Object(DB 작업하는 객체)
public class BoardDao {

    public int insBoard(Board board) {
        int result = 0;

        String sql = "INSERT INTO board " + // ""안에서 띄워쓰기 하고 엔터누르면 자동으로 문자열 유지하고 줄바꿈이 된다.
                " SET title= ? " +
                "   ,contents= ? " +
                "   ,writer = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {

            //? 부분에 값 채우기
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    public int delBoard(int boardId) {
        int result = 0;
        String sql = " DELETE  " +
                "FROM board " +
                "WHERE board_id=? ";

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, boardId);
            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    //Select 를 해보자
    //전수로(전부) 받을거기 때문에 메소드 파라미터는 없어도 된다.
    //Board 객체의 주소값(sql에서는 하나하나의 투플을 의미)을
    public List<Board> selBoardList() {
        List<Board> list = new ArrayList<>();
        String sql = "";
        sql = "SELECT board_id,title,writer,created_at " +
                "FROM board " +
                "ORDER BY board_id DESC ";

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)
             ; ResultSet rs = ps.executeQuery()) {
            //SELECT만 executeQuery()를 쓴다. 이것의 리턴타입은 ResultSet 이다.

            while (rs.next()) { // rs.next()는 순차적으로 투플을 선택, 리턴타입은 boolean 이다.
                Board board = new Board(); //투플마다 새로운 board객체가 사용되므로 while문 안에 넣어준다.
                list.add(board);
                board.setBoardId(rs.getInt("board_id"));//컬럼명이 board_id인 데이터를 정수형으로 가져와서 setBoardId에 넣어준다.
                String title = rs.getString("title"); // 컬럼명이 title 인 데이터를 String 으로 가져와서 title 에 넣는다.
                board.setTitle(title);
                board.setWriter(rs.getString("writer"));// 컬럼명이 writer 인 데이터를 String으로 가져와서 writer 에 넣는다.
                board.setCreatedAt(rs.getString("created_at"));// 컬럼명이 title 인 데이터를 찾아서 titel에 넣는다.

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    // 원하는 boardId 의 데이터를 select 하고 싶을때
    public Board selBoardOne(int boardId) {
        List<Board> list = new ArrayList<>();
        String sql = "";
        sql = "SELECT board_id,title,writer,created_at " +
                "FROM board " +
                "WHERE board_id=? ";

        ResultSet rs = null;

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, boardId);
            rs = ps.executeQuery();

            if (rs.next()) { // 경우의수는 2가지이다. 투플이 있는지, 없는지 그래서 if로 처리한다. 투플이 있으면 true 반환
                Board board = new Board(); // 투플마다 새로운 board 객체 생성
                board.setBoardId(rs.getInt("board_id"));//컬럼명이 board_id인 데이터를 정수형으로 가져와서 setBoardId에 넣어준다.
                board.setTitle(rs.getString("title"));
                board.setWriter(rs.getString("writer"));// 컬럼명이 writer 인 데이터를 String으로 가져와서 writer 에 넣는다.
                board.setCreatedAt(rs.getString("created_at"));// 컬럼명이 created_at 인 데이터를 찾아서 titel에 넣는다.
                return board;
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        return null;
    }


    public int updateBoard(Board board) {
        int result = 0;
//      String sql="";

        String sql = " UPDATE board  " +
                " SET TITLE= ? " +
                " , CONTENTS = ? " +
                " , WRITER = ? " +
                " WHERE board_id = ? ";

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            ps.setInt(4, board.getBoardId());
            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    // 동적인 UPDATE문을 해주고 싶을때(모든 컬럼을 바꿔주고싶을때는 위에처럼, 만약 수정하고 싶은 컬럼이 1개이거나 2개일때는 동적인 UPDATE문 사용)
    public int updBoardDynamic(Board board) {
        int result = 0;

        StringBuilder sb = new StringBuilder();

        //제목이 빈칸이 아니라면 추가할거다.
        if (board.getTitle() != null && !board.getTitle().equals("")) {
            sb.append(String.format(", title= '%s' ", board.getTitle()));

        }
        if (board.getContents() != null && !board.getContents().equals("")) {
            sb.append(String.format(", contents= '%s' ", board.getContents()));
        }

        if (board.getContents() != null && !board.getContents().equals("")) {
            sb.append(String.format(", writer= '%s' ", board.getWriter()));
        }

        sb.deleteCharAt(0);

        String sql2 = String.format("UPDATE board " +
                "SET %s " +
                "WHERE board_id=%d ", sb.deleteCharAt(0), board.getBoardId());
        System.out.println(sql2);

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql2)) {
            result = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;


    }
}
