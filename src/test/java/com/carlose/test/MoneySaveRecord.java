package com.carlose.test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Carlose wei
 * @version 1.0
 * @date 2019/11/29 17:40
 */
public class MoneySaveRecord {
  /**
   * 主键ID
   */
  private Long id;

  /**
   * 京东pin
   */
  private String jdPin;

  /**
   * 支付唯一编码
   */
  private String payUuid;

  /**
   * 二级业务编码
   */
  private String businessCode;

  /**
   * 二级业务描述
   */
  private String businessDesc;

  /**
   * 用户支付金额
   */
  private BigDecimal payAmount;

  /**
   * 用户支付时间
   */
  private Date payTime;

  /**
   * 攒钱金额
   */
  private BigDecimal saveAmount;

  /**
   * 银行卡id
   */
  private Long bankCardId;

  /**
   * 银行名称
   */
  private String bankName;

  /**
   * 银行卡后4位
   */
  private String cardTailNum;

  /**
   * 笔笔攒业务订单号，用于传给下游
   */
  private String orderId;

  /**
   * 定投小金库订单号,定投返回
   */
  private String investId;

  /**
   * 状态，0新建，1定投成功，2定投失败
   */
  private Integer saveStatus;

  /**
   * 定投结果描述，一般存失败原因
   */
  private String resultDesc;

  /**
   * 更新时间
   */
  private Date updateDate;

  /**
   * 创建时间
   */
  private Date createdDate;

  private static final long serialVersionUID = 1L;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getJdPin() {
    return jdPin;
  }

  public void setJdPin(String jdPin) {
    this.jdPin = jdPin;
  }

  public String getPayUuid() {
    return payUuid;
  }

  public void setPayUuid(String payUuid) {
    this.payUuid = payUuid;
  }

  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public String getBusinessDesc() {
    return businessDesc;
  }

  public void setBusinessDesc(String businessDesc) {
    this.businessDesc = businessDesc;
  }

  public BigDecimal getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(BigDecimal payAmount) {
    this.payAmount = payAmount;
  }

  public Date getPayTime() {
    return payTime;
  }

  public void setPayTime(Date payTime) {
    this.payTime = payTime;
  }

  public BigDecimal getSaveAmount() {
    return saveAmount;
  }

  public void setSaveAmount(BigDecimal saveAmount) {
    this.saveAmount = saveAmount;
  }

  public Long getBankCardId() {
    return bankCardId;
  }

  public void setBankCardId(Long bankCardId) {
    this.bankCardId = bankCardId;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getCardTailNum() {
    return cardTailNum;
  }

  public void setCardTailNum(String cardTailNum) {
    this.cardTailNum = cardTailNum;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getInvestId() {
    return investId;
  }

  public void setInvestId(String investId) {
    this.investId = investId;
  }

  public Integer getSaveStatus() {
    return saveStatus;
  }

  public void setSaveStatus(Integer saveStatus) {
    this.saveStatus = saveStatus;
  }

  public String getResultDesc() {
    return resultDesc;
  }

  public void setResultDesc(String resultDesc) {
    this.resultDesc = resultDesc;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }
}
