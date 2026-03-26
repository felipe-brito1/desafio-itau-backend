package com.felipebrito.desafio_itau.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsDTO {
    private Long count;
    private Double sum;
    private Double avg;
    private Double min;
    private Double max;

    public StatisticsDTO(){
    }
    public StatisticsDTO(DoubleSummaryStatistics statistics){
        this.count = statistics.getCount();
        this.sum = statistics.getSum();
        this.avg = statistics.getAverage();
        this.min = statistics.getAverage();
        this.max = statistics.getMax();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }
}
