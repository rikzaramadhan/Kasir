/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
class Payment {
  int Amount, Payment;
  Product product;
  
  //SETTER
  public void setProduct(Product product) {
      this.product = product; 
  }
  
  public void setAmount(int amount) {
    this.Amount = amount;
  }

  public void setPayment(int payment) {
    this.Payment = payment;
  }
  
  //GETTER
     public Product getProduct() {
    return product; 
  }
   
    public int getAmount() {
    return Amount;
  }
  
    public int getPayment() {
    return Payment;
  }

  //CALCULATION
  public int Bill, moneyChanges;
  int Bill() {
      return getAmount() * product.getPrice();
  }
  int moneyChanges() {
      return getPayment() - Bill();
  }
} 

