public class StringStack {


        private int maxSize;
        private int top;
        private char stackArray[];


        public StringStack(int size){
            this.maxSize = size;
            this.stackArray = new char[maxSize];
            this.top = -1;
        }


        public void push(char element){

            if(isFull()) {
                System.out.println("This stack is already Full");
            }
            else {
                top++;
                stackArray[top] = element;

            }
        }

        public char pop() {

            if (isEmpty()) {
                System.out.println("This is EMPTY");
                return '1';
            } else {
                int old_top = top;
                top--;
                return stackArray[old_top];
            }
        }

        public long peek(){

            return stackArray[top];
        }

        public boolean isEmpty(){

            return (top == -1);
        }

        public boolean isFull(){
            return (maxSize - 1 == top);
        }
    }

