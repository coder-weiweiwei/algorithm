package com.cyw.demo.generic;

/**
 * @auther: chenyw
 * @time: 2020/8/27
 * @description:
 */
public class BaseGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BaseGenerator(Class<T> type){
        this.type = type;
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BaseGenerator<T>(type);
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        }
    }
}

class CountedObject{
    private static int count = 0;
    private final long id = count++;
    public long id(){
        return id;
    }
    public String toString(){
        return "CountObject" + id;
    }

    public static void main(String[] args) {
        Generator<CountedObject> generator = BaseGenerator.create(CountedObject.class);
        for(int i = 0; i < 5; i++){
            System.out.println(generator.next());
        }
    }
}
