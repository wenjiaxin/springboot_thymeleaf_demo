package com.offcn.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@AllArgsConstructor  //有参构造
@NoArgsConstructor   //无参构造
public class Person implements Serializable {


   private Long id;

   private String name;

   private Integer age;
}
