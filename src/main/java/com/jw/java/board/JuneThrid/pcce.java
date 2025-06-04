import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int[]> result = new ArrayList<>();

        int idx = 0;
        switch (ext) {
            case "code": idx = 0; break;
            case "date": idx = 1; break;
            case "maximum": idx = 2; break;
            case "remain": idx = 3; break;
        }

        // 필터링
        for (int i = 0; i < data.length; i++) {
            if (data[i][idx] <= val_ext) {
                result.add(data[i]);
            }
        }

        // 정렬 기준 설정
        int sortIdx = 0;
        switch (sort_by) {
            case "code": sortIdx = 0; break;
            case "date": sortIdx = 1; break;
            case "maximum": sortIdx = 2; break;
            case "remain": sortIdx = 3; break;
        }

        // 정렬
        int finalSortIdx = sortIdx; // 람다 외부에서 final 변수로 복사
        result.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[finalSortIdx], b[finalSortIdx]);
            }
        });

        // 리스트를 이중 배열로 변환
        return result.toArray(new int[result.size()][]);
    }
}
