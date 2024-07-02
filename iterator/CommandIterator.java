package iterator;

import java.util.Iterator;
import java.util.List;

// Итератор команд, которым обучены животные
public class CommandIterator implements Iterator<String> {
    private List<String> commandList;
    private int count;

    public CommandIterator(List<String> commandList) {
        this.commandList = commandList;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return (count < commandList.size());
    }

    @Override
    public String next() {
        if (hasNext()) return commandList.get(count++);
        return null;
    }

}
