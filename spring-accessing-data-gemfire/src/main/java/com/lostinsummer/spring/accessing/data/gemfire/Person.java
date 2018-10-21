package com.lostinsummer.spring.accessing.data.gemfire;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.annotation.Region;

import lombok.Getter;

//制定实例生成区域
@Region(value = "People")
public class Person implements Serializable {

	// gemfire是个内存数据网格 Region可以看成是一个Map
	// 标注了@Id的就相当于Map中的key value是类的实例Person
	@Id
	private @Getter String name;

	private @Getter int age;

	@PersistenceConstructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("%s is %d years old", getName(), getAge());
	}

}
