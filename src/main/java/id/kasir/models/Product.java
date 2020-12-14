


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
public class Product {
    
  public int Code, Price;
  public String Name;

  //SETTER
  public void setCode(int code) {
    this.Code = code;
  }

  public void setName(String name) {
    this.Name = name;
  }

  public void  setPrice(int price) {
    this.Price = price;
  }

 

  //GETTER
  public int getCode() {
    return Code;
  }
  
  public int getPrice() {
    return Price;
  }
  
  public String getName() {
    return Name;
  }
}


