package services;

import java.util.List;

public class SumOverMaxService {
    public SumOverMaxService(ListMaxService listMaxService,
                             ListSumService listSumService) {
        this.listMaxService = listMaxService;
        this.listSumService = listSumService;
    }

    private ListMaxService listMaxService;
    private ListSumService listSumService;

    public float getSumOverMax(int[]  arr) {
        return listSumService.sum(arr)/listMaxService.max(arr);
    }
}