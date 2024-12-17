package com.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Scope;

@State(Scope.Thread)  // スレッドごとの状態を保持
public class PerformanceBenchmark {
    public static void main(String[] args) {
        System.out.println("Hello, JMH Benchmark!");
        // JMHのコードや必要なロジックをここに記述
    }

    // ベンチマーク対象のメソッド
    @Benchmark
    @Warmup(iterations = 3)  // 初期のウォームアップ
    @Measurement(iterations = 5)  // 計測回数
    public void testMethod() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
    }

}
