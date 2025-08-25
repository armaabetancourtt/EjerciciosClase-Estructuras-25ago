package Priority;

/**
 *
 * @author abeta
 */

public class PriorityQueue {

    private PriorityNode[] data;
    private int size;
    private int capacity;

    public PriorityQueue() {
        this.capacity = 10;
        this.data = new PriorityNode[capacity + 1]; // índice 1-base para heap
        this.size = 0;
    }

    public void push(int priority, String value) {
        if (size + 1 >= data.length) {
            resize();
        }

        PriorityNode nodeToInsert = new PriorityNode(priority, value);
        size++;
        data[size] = nodeToInsert;

        int current = size;
        int parent = current / 2;

        while (parent > 0 && data[parent].getPriority() > data[current].getPriority()) {
            PriorityNode temp = data[parent];
            data[parent] = data[current];
            data[current] = temp;

            current = parent;
            parent = current / 2;
        }
    }

    private void resize() {
        capacity *= 2;
        PriorityNode[] newData = new PriorityNode[capacity + 1];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public int getSize() {
        return size;
    }

    public PriorityNode pop() {
        if (size == 0) return null;

        PriorityNode min = data[1];
        data[1] = data[size];
        data[size] = null;
        size--;

        int current = 1;
        while (true) {
            int left = current * 2;
            int right = current * 2 + 1;
            int smallest = current;

            if (left <= size && data[left].getPriority() < data[smallest].getPriority()) {
                smallest = left;
            }
            if (right <= size && data[right].getPriority() < data[smallest].getPriority()) {
                smallest = right;
            }
            if (smallest == current) break;

            PriorityNode temp = data[current];
            data[current] = data[smallest];
            data[smallest] = temp;

            current = smallest;
        }

        return min;
    }
}
