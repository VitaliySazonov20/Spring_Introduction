package com.sazonov.springCourse.aspectOrientedProgramming.aspects;



import com.sazonov.springCourse.aspectOrientedProgramming.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    /*Execution pointCut
    *
    * execution(access-modifiers-patter? return-type-pattern declaring-type-patter?
    *       method-name-patter(parameters-pattern) throws-pattern?)
    *
    * PointCuts without ? are required
    *
    * PointCut with * is wild card so get* is any method that starts with get
    *
    * Order annotation controls what aspects are done in what order
    * */

//    @Pointcut("execution(* com.sazonov.springCourse.aspectOrientedProgramming.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//    @Pointcut("execution(* com.sazonov.springCourse.aspectOrientedProgramming.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: Writing Log #1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: Writing Log #2");
//    }
//    @Before("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    public void allMethodsLoggingAdvice(){
//        System.out.println("allMethodsLoggingAdvice: Writing Log #3");
//    }


//    @Pointcut("execution(public * get*())")
//    private void allGetMethods(){}


//    @Before("execution(public void com.sazonov.springCourse.aspectOrientedProgramming.UniversityLibrary.getBook())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: Attempt to get a book");
//    }
    @Before("com.sazonov.springCourse.aspectOrientedProgramming.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddBookAdvice(JoinPoint joinPoint){

//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + joinPoint.getSignature());
        System.out.println("methodSignature name = " + joinPoint.getSignature().getName());
        Object[] arguments = joinPoint.getArgs();
        for(Object obj: arguments){
            if(obj instanceof Book){
                Book myBook = (Book) obj;
                System.out.println("Information about book: Name - "+
                        myBook.getName() + ", author -"+ myBook.getAuthor() +", publication year - "+
                        myBook.getPublicationYear());

            }
        }



        System.out.println("beforeAddBookAdvice: Logging the attempt to get a book/magazine");
        System.out.println("---------------------------------------------------------------");
    }
//    @After("allGetMethods()")
//    public void afterGetBookAdvice(){
//        System.out.println("afterGetBookAdvice: A book has been taken");
//    }
////    @Before("execution(public * returnBook(..))")
////    public void beforeReturnBookAdvice(){
////        System.out.println("beforeReturnBookAdvice: Attempt to return book");
////    }
//    @Before("execution(public * returnBook(com.sazonov.springCourse.aspectOrientedProgramming.Book))")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: Attempt to return book");
//    }


}
