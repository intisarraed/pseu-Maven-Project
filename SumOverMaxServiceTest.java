package services;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SumOverMaxServiceTest {

    @Test
    public void testSumOverMax() {

       ListSumService mockSUM = mock(ListSumService.class);
        int[] nums = {1, 2, 3};
        when(mockSUM.sum(nums)).thenReturn(6);


        ListMaxService mockMAX = mock(ListMaxService.class);

        when(mockMAX.max(nums)).thenReturn(3);


        SumOverMaxService res= new SumOverMaxService(mockMAX,mockSUM);
       float r= res.getSumOverMax(nums);
        assertEquals(2, res);
    }

}