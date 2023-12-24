using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int> bridge = new Queue<int>();
        
        // 경과시간
        int elapsedTime = 0;
        // 다리에 올라간 트럭 무게
        int curTrucksWeight = 0;
        // 지나간 트럭 수
        int truckCnt = 0;
        
        while (true) {
            if (truckCnt == truck_weights.Length) {
                // 트럭이 다 지나가면 break
                break;
            } 
            
            if (bridge.Count == bridge_length) {
                curTrucksWeight -= bridge.Dequeue();
            }
            
            if (curTrucksWeight + truck_weights[truckCnt] <= weight) {
                // 다리가 트럭의 무게를 버티면
                bridge.Enqueue(truck_weights[truckCnt]);
                curTrucksWeight += truck_weights[truckCnt];
                truckCnt++;
            } else {
                bridge.Enqueue(0);
            }
            
            elapsedTime++;
        }
        
        return elapsedTime + bridge_length;
    }
}