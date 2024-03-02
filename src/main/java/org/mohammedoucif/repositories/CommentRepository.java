package org.mohammedoucif.repositories;

import org.mohammedoucif.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
