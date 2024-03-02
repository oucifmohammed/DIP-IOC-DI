package org.mohammedoucif.proxies;

import org.mohammedoucif.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
