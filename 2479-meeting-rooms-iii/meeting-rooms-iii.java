class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> freeRooms = new PriorityQueue<>();

        PriorityQueue<Node> busyRooms = new PriorityQueue<>(
            (a, b) -> a.nextAvailable == b.nextAvailable ? a.room - b.room : a.nextAvailable - b.nextAvailable
        );

        for (int i = 0; i < n; i++) {
            freeRooms.add(i);
        }

        Map<Integer, Integer> meetingMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            meetingMap.put(i, 0);
        }

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            int duration = end - start;

            while (!busyRooms.isEmpty() && busyRooms.peek().nextAvailable <= start) {
                freeRooms.add(busyRooms.poll().room);
            }

            if (!freeRooms.isEmpty()) {
                int room = freeRooms.poll();
                meetingMap.put(room, meetingMap.get(room) + 1);
                busyRooms.add(new Node(room, start + duration));
            } else {
                Node earliestRoom = busyRooms.poll();
                meetingMap.put(earliestRoom.room, meetingMap.get(earliestRoom.room) + 1);
                busyRooms.add(new Node(earliestRoom.room, earliestRoom.nextAvailable + duration));
            }
        }

        int maxMeetings = 0, resultRoom = 0;
        for (int i = 0; i < n; i++) {
            if (meetingMap.get(i) > maxMeetings || (meetingMap.get(i) == maxMeetings && i < resultRoom)) {
                maxMeetings = meetingMap.get(i);
                resultRoom = i;
            }
        }

        return resultRoom;
    }
}

class Node {
    int room;
    int nextAvailable;

    Node(int room, int nextAvailable) {
        this.room = room;
        this.nextAvailable = nextAvailable;
    }
}
