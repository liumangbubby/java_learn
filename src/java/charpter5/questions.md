### 1. 
```
给定一个数组，
int[] abc = { 20, 90, 48, 92};

请把第1个数和最后一个数对调
即，
对调之后数组的内容为： 92    90  48   20
```

### 2.
```
任意给定一个数组,
		double[] src = { 4, 5.5,  6, 7.7 };

写代码把 src 中的内容倒序存储。倒序后，src的内容变成:   7.7   6   5.5   4
```

### 3.
```
求出所有1000以内的质数，并存到数组里，需要考虑数组的自动扩容，最后顺序输出该数组。
```

### 4. 思考以下代码的输出结果
```
public class Demo {
    public static void main(String[] args) {
        Person p = new Person("张三");

        change(p);

        System.out.println(p.name);
    }

    public static void change(Person p) {
        Person person = new Person("李四");
        p = person;
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}
```