package org.mohammedoucif.services;

import org.mohammedoucif.model.Comment;
import org.mohammedoucif.proxies.CommentNotificationProxy;
import org.mohammedoucif.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  In this example, CommentService depends on CommentRepository and commentNotificationProxy
 *  to implement the publishComment feature.
 *
 *  In this class, we are applying the Dependency Injection (DI)
 *  using @Autowired to inject the required dependencies.
 *  The Spring Context is responsible for providing the instances we want.
 *
 *  We are also applying the DIP (Dependency Inversion Principle) by
 *  making the class depends on the abstraction and not concretion.
 *  This promotes loose coupling.
 */
@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
