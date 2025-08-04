package com.lkm.Service;

import com.lkm.DAO.BoardDAO;
import com.lkm.DTO.Board;

public class BoardServiceImpl implements BoardService {

    BoardDAO boardDAO = new BoardDAO();

    @Override
    public int insert(Board board) {
        return boardDAO.insert(board);
    }
}
