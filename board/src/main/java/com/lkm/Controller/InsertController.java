package com.lkm.Controller;

import java.io.IOException;

import com.lkm.Main;
import com.lkm.DAO.BoardDAO;
import com.lkm.DTO.Board;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InsertController {

    @FXML
    private Button btnCommit;

    @FXML
    private TextArea txtContent;

    @FXML
    private TextField txtTitle;

    @FXML
    private TextField txtWriter;

    private BoardDAO boardDAO;

    @FXML
    void initialize(){
        boardDAO = new BoardDAO();
    }

    @FXML
    void insert(ActionEvent event) throws IOException {
        // 게시글 등록
        Board board = Board.builder().title(txtTitle.getText())
                                    .writer(txtTitle.getText())
                                    .content(txtContent.getText())
                                    .build();
        
        int result = boardDAO.insert(board);

        if(result > 0){
            System.out.println("게시글 등록 성공!");
        } else {
            System.out.println("게시글 등록 실패!");
        }

        // 게시글 목록으로 이동
        Main.setRoot("List");
    }
}
