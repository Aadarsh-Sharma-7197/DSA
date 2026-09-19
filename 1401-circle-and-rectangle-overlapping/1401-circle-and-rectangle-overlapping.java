class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int px = Math.max(x1,Math.min(xCenter,x2));
        int py = Math.max(y1,Math.min(yCenter,y2));
        int dx = px - xCenter;
        int dy = py - yCenter;
        return dx * dx + dy * dy <= radius * radius;
    }
}