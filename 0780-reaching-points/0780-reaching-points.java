class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx > sx && ty > sy) {
            if (tx > ty)
                tx = tx % ty;
            else
                ty = ty % tx;
        }
        if (tx == sx && ty >= sy && (ty - sy) % sx == 0)
            return true;
        if (ty == sy && tx >= sx && (tx - sx) % sy == 0)
            return true;
        return false;
    }
}