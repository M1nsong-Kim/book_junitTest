/***
 * Excerpted from "Pragmatic Unit Testing in Java with JUnit",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/utj2 for more book information.
***/
package iloveyouboss;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*; 
import org.junit.*;

public class ScoreCollectionTest {
   @Test
   public void answersArithmeticMeanOfTwoNumbers() {
      // 준비
	   	// 테스트 설정 준비
      ScoreCollection collection = new ScoreCollection();
      collection.add(() -> 5);
      collection.add(() -> 7);
      
      // 실행
      	// 검증하려는 코드
      int actualResult = collection.arithmeticMean();
      
      // 단언 (테스트 가장 마지막에 넣기)
      assertThat(actualResult, equalTo(6));	// 6 이외 숫자는 테스트 실패
      // The method assertThat(Integer, Matcher<? super Integer>) from the type Assert is deprecated: 더 이상 사용하지 않는 메서드
   }
}
