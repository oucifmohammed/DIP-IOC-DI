package org.mohammedoucif;

import org.mohammedoucif.model.Comment;
import org.mohammedoucif.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * We create the spring context aka ioc container
 * which will control the instances we tell it to control.
 *
 * By using Spring Context, we are applying IOC (Inversion of Control).
 * It means that instead of making our app responsible for handling objects
 * and dependencies, we give this task to the Framework, which in our case is Spring.
 *
 * After that, we can easily retrieve the instances using getBean.
 */
public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfiguration.class
        );


        Comment comment = new Comment();
        comment.setAuthor("Mohammed Oucif");
        comment.setText("Demo Content");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
