package com.valuation.modelling;

/**
 * @ClassName TenDecadeService
 * @Description TODO
 * @Author Zhaoyb
 * @Date 2020/2/27 12:37
 * @Version 1.0
 **/
public class TenDecadeService {


  public static void main(String[] args) {
    //总股本(亿元)
    double capitalStock = 119.33;
    //今年税后净利润(亿元)
    double retainedProfits = 189.04;
    //净利润增长率
    double growthRate = 0.03;
    //年限(年)
    int yeayCount = 10;
    //每年净利润(亿元)
    double pearRetainedProfits;
    //n年后净利润增长之和(亿元)
    double retainedProfitsTotal = 0.00;
    double pearSharePrice = 0.0;
    for (int i = 1; i <= yeayCount; i++) {
      pearRetainedProfits = Math.pow((1 + growthRate), i) * retainedProfits;
      retainedProfitsTotal += pearRetainedProfits;
    }
    System.out.println("市值合理范围" + retainedProfitsTotal);
    pearSharePrice = retainedProfitsTotal / capitalStock;
    System.out.println("预估股价" + pearSharePrice);
  }


}
