package jp.ac.uryukyu.ie.e165742;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by e165742 on 2017/02/06.
 */
public class AnswerTest {
    @Test
    public void getAnswer() throws Exception {
        Answer answer=new Answer();
        Map<Integer,Boolean > look = new HashMap<Integer, Boolean>();
        int[] answer_number = answer.getAnswer();
        for(int i = 0; i<answer_number.length; i++){
            assertNull(look.get(answer_number[i]));
            look.put(answer_number[i],true);
            assertTrue(answer_number[i]>=0 && answer_number[i]<=9 );
        }
    }

}