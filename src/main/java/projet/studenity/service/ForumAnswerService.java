package projet.studenity.service;

import projet.studenity.model.Answer;
import projet.studenity.model.Forum;

import java.util.List;

public interface ForumAnswerService {
    Forum findForumById(int idForum);
    Answer findAnswerById(int idAnswer);
    boolean addForum(Forum forum);
    boolean addAnswerToForum(Answer answer);
    boolean deleteForum(Forum forum);
    boolean deleteAnswer(Answer answer);
    boolean updateForum(Forum forum);
    boolean updateAnswer(Answer answer);
    public abstract List<Forum> getForums();
    List<Answer> listAnswerByForum(int idForum);
}
