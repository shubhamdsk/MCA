class QueueArray {
    constructor(maxcap) {
        this.array = Array(maxcap);
        this.capacity = maxcap;
        this.currentlength = 0;
        this.front = -1;
        this.rear = -1;
    }
    isempty() {
        return this.currentlength == 0
    }
    isfull() {
        return this.currentlength == this.capacity;
    }
    enqueue(data) {
        if (this.isfull()) {
            return undefined;
        }
        if (this.isempty()) {
            this.front = 0;
            this.rear = 0;
            this.array[this.rear] = data;
            this.currentlength = 1;
        } else {
            this.rear++;
            this.array[this.rear] = data;
            this.currentlength++;
        }
        return data;
    }
    dequeue() {
        let temp = this.front;
        if (this.isempty()) {
            return undefined;
        }
        if (this.currentlength == 1) {
            this.rear = -1;
            this.front = -1;
        } else {
            this.array[this.front] = null;
            this.front++;
        }
        this.currentlength--;
        return temp;
    }
}
const qa = new QueueArray(5);
console.log("Enqueue Operation");
qa.enqueue(23);
qa.enqueue(33);
qa.enqueue(43);
qa.enqueue(53);
qa.enqueue(63);
console.log(qa);
console.log("Dequeue Operation");
qa.dequeue();
qa.dequeue();
qa.dequeue();
qa.dequeue();
console.log(qa);
