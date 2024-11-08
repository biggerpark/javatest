package com.green.database;

import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        Board board = null; // insert 시에만  board가 필요하므로 우선 전역변수로 null 로 초기화 해줌.


        //위의 String[] 타입인 args 를 활용해보자.
        // 위의 BoardDaoTest v 클릭해서 Edit configurations 누르면 Program arguments 칸에서 바로 배열에 들어갈 값들을 넣으면 된다.
        // 이때 띄워쓰기 해주면 배열칸을 구분해주는 것이다.(0번방,1번방,2번방)
        if (args.length > 0) {
            board = new Board();
            board.setTitle(args[0]);
            board.setContents(args[1]);
            board.setWriter(args[2]);

            if (args.length == 4) {
                board.setBoardId(Integer.parseInt(args[3]));
            }
        }

        // update 해주고싶을때 board 객체의 set 메소드 를 사용하여
        // 각 배열에 넣고나서, 그 후의 배열에 문자열을 정수형으로 변환하여 board 객체에 넣어준다.
        // 그래서 여기서 set 메소드 가 3개 이므로 그 후인 3번방에 update 할 문자열을 넣어준다.


//        insert(dao, board);
//        delete(dao);
//        update(dao, board);

        updateDynamic(dao,board);

        selectAll(dao);

        selectOne(dao,9);

    }

//    private static void insert(BoardDao dao){
//        Board board=new Board();
//        board.setTitle("올해 연말 가요제 내가 볼 무대는 거의 없네");
//        board.setContents("유튜부든 뭐든 해서 찾아봤는데 올해는 뭔가 아쉽네");
//        board.setWriter("MS07B");
//
//        int result= dao.insBoard(board);
//        System.out.println("result:"+result);
//    }


    //위에서 String[] arg
    private static void insert(BoardDao dao, Board board) {

        int result = dao.insBoard(board);
        System.out.println("result:" + result);
    }


    private static void delete(BoardDao dao) {
        int result = dao.delBoard(1);
        System.out.println("result:" + result);
    }

    private static void selectAll(BoardDao dao){
        List<Board> list=dao.selBoardList();
        for(Board b:list){
            System.out.println(b);
        }
//        System.out.println(list); -- 배열로 안나타내고 투플마다 정보를 볼거기때문에 위에처럼 처리한다.
    }

    private static void selectOne(BoardDao dao,int boardId){
        Board board=dao.selBoardOne(boardId);
        System.out.println(board);

    }


    private static void update(BoardDao dao, Board board) {
        int result = dao.updateBoard(board);
        System.out.println("result:" + result);
    }

    private static void updateDynamic(BoardDao dao, Board board) {
        int result = dao.updBoardDynamic(board);
        System.out.println("result:" + result);
    }


}
