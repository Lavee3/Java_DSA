import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {

        int n = positions.length;

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++)
            indices[i] = i;

        // sort robots based on position
        Arrays.sort(indices, (a, b) -> positions[a] - positions[b]);

        Stack<Integer> stack = new Stack<>();

        for (int idx : indices) {

            // moving right → push to stack
            if (directions.charAt(idx) == 'R') {
                stack.push(idx);
            } 
            else {

                // collision handling
                while (!stack.isEmpty() && directions.charAt(stack.peek()) == 'R') {

                    int top = stack.peek();

                    if (healths[top] < healths[idx]) {
                        healths[stack.pop()] = 0;
                        healths[idx]--;
                    } 
                    else if (healths[top] > healths[idx]) {
                        healths[top]--;
                        healths[idx] = 0;
                        break;
                    } 
                    else {
                        healths[stack.pop()] = 0;
                        healths[idx] = 0;
                        break;
                    }
                }

                if (healths[idx] > 0) {
                    stack.push(idx);
                }
            }
        }

        // collect surviving robots
        List<Integer> survivors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                survivors.add(healths[i]);
            }
        }

        return survivors;
    }
}
