package com.eden.iterator;

/**
 * @created by eden
 * @since 2019-03-14 下午 3:16:20
 */

public class NamedRepositoryImpl implements Repository {

    String names[] = {"a", "b", "c"};


    @Override
    public Iterator getIterator() {
        return new RepositoryIterator();
    }

    public static void main(String[] args) {

        Repository repository = new NamedRepositoryImpl();
        Iterator iterator = repository.getIterator();

        for (; iterator.hasNext(); ){
            System.out.println(iterator.next());
        }

    }

    private class RepositoryIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
