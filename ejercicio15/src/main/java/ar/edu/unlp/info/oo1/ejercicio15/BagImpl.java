package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        // TODO Completar con la instanciación adecuada
        this.elements = new HashMap <T, Integer>();
    }

    @Override
    public boolean add(T element) {
        // TODO Completar con la implementación correspondiente
    	if(elements.containsKey(element)) {
        	int valorNuevo = elements.get(element);
        	valorNuevo++;
        	elements.put(element, valorNuevo);
        	return true;
        }
    	return false;
    }

    @Override
    public int occurrencesOf(T element) {
        // TODO Completar con la implementación correspondiente
    	if(elements.containsKey(element)) {
    		return elements.get(element);
    	}
        return 0;
    }

    @Override
    public void removeOccurrence(T element) {
        if(elements.containsKey(element)) {
        	Integer valorNuevo = elements.get(element);
        	valorNuevo--;
        	elements.put(element, valorNuevo);
        }
    }

    @Override
    public void removeAll(T element) {
    	if (elements.containsKey(element)) {
    		elements.remove(element);
    	}
        
    }

    @Override
    public int size() {
    	return elements.entrySet().stream().mapToInt(e-> e.getValue()).sum();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}

