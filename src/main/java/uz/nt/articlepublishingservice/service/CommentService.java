package uz.nt.articlepublishingservice.service;

import uz.nt.articlepublishingservice.dto.CommentDto;
import uz.nt.articlepublishingservice.dto.ResponseDto;

import java.util.List;

public interface CommentService {
    ResponseDto<List<CommentDto>> viewAll(Integer id);
    ResponseDto<CommentDto> addComment(String comment, Integer article_id);
    ResponseDto<CommentDto> removeComment(Integer id);
}