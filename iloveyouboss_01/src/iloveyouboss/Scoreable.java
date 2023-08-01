/***
 * Excerpted from "Pragmatic Unit Testing in Java with JUnit",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/utj2 for more book information.
***/
package iloveyouboss;

// 함수형 인터페이스: 추상 메서드가 오직 하나만 존재하는 인터페이스
@FunctionalInterface	// 함수형 인터페이스 조건에 부합하는지 검사	
public interface Scoreable {
   int getScore();
}
