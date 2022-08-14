# java8-collectors-api
<ol>

<li>public static <T, C extends java.util.Collection<T>> java.util.stream.Collector<T, ?, C> toCollection(java.util.function.Supplier<C>);<br><br></li>
<li>public static <T> java.util.stream.Collector<T, ?, java.util.List<T>> toList();<br><br></li>
 <li> public static <T> java.util.stream.Collector<T, ?, java.util.Set<T>> toSet();<br><br></li>
  <li>public static java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> joining();<br><br></li>
  <li>public static java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> joining(java.lang.CharSequence);<br><br></li>
  <li>public static java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> joining(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence);<br><br></li>
  <li>public static <T, U, A, R> java.util.stream.Collector<T, ?, R> mapping(java.util.function.Function<? super T, ? extends U>, java.util.stream.Collector<? super U, A, R>);<br><br></li>
  <li>public static <T, A, R, RR> java.util.stream.Collector<T, A, RR> collectingAndThen(java.util.stream.Collector<T, A, R>, java.util.function.Function<R, RR>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.lang.Long> counting();<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.util.Optional<T>> minBy(java.util.Comparator<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.util.Optional<T>> maxBy(java.util.Comparator<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.lang.Integer> summingInt(java.util.function.ToIntFunction<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.lang.Long> summingLong(java.util.function.ToLongFunction<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.lang.Double> summingDouble(java.util.function.ToDoubleFunction<? super T>);<br><br></li>
  <li>static double[] sumWithCompensation(double[], double);<br><br></li>
  <li>static double computeFinalSum(double[]);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.lang.Double> averagingInt(java.util.function.ToIntFunction<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.lang.Double> averagingLong(java.util.function.ToLongFunction<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.lang.Double> averagingDouble(java.util.function.ToDoubleFunction<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, T> reducing(T, java.util.function.BinaryOperator<T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.util.Optional<T>> reducing(java.util.function.BinaryOperator<T>);<br><br></li>
  <li>public static <T, U> java.util.stream.Collector<T, ?, U> reducing(U, java.util.function.Function<? super T, ? extends U>, java.util.function.BinaryOperator<U>);<br><br></li>
  <li>public static <T, K> java.util.stream.Collector<T, ?, java.util.Map<K, java.util.List<T>>> groupingBy(java.util.function.Function<? super T, ? extends K>);<br><br></li>
  <li>public static <T, K, A, D> java.util.stream.Collector<T, ?, java.util.Map<K, D>> groupingBy(java.util.function.Function<? super T, ? extends K>, java.util.stream.Collector<? super T, A, D>);<br><br></li>
  <li>public static <T, K, D, A, M extends java.util.Map<K, D>> java.util.stream.Collector<T, ?, M> groupingBy(java.util.function.Function<? super T, ? extends K>, java.util.function.Supplier<M>, java.util.stream.Collector<? super T, A, D>);<br><br></li>
  <li>public static <T, K> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, java.util.List<T>>> groupingByConcurrent(java.util.function.Function<? super T, ? extends K>);<br><br></li>
  <li>public static <T, K, A, D> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, D>> groupingByConcurrent(java.util.function.Function<? super T, ? extends K>, java.util.stream.Collector<? super T, A, D>);<br><br></li>
  <li>public static <T, K, A, D, M extends java.util.concurrent.ConcurrentMap<K, D>> java.util.stream.Collector<T, ?, M> groupingByConcurrent(java.util.function.Function<? super T, ? extends K>, java.util.function.Supplier<M>, java.util.stream.Collector<? super T, A, D>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.util.Map<java.lang.Boolean, java.util.List<T>>> partitioningBy(java.util.function.Predicate<? super T>);<br><br></li>
  <li>public static <T, D, A> java.util.stream.Collector<T, ?, java.util.Map<java.lang.Boolean, D>> partitioningBy(java.util.function.Predicate<? super T>, java.util.stream.Collector<? super T, A, D>);<br><br></li>
  <li>public static <T, K, U> java.util.stream.Collector<T, ?, java.util.Map<K, U>> toMap(java.util.function.Function<? super T, ? extends K>, java.util.function.Function<? super T, ? extends U>);<br><br></li>
  <li>public static <T, K, U> java.util.stream.Collector<T, ?, java.util.Map<K, U>> toMap(java.util.function.Function<? super T, ? extends K>, java.util.function.Function<? super T, ? extends U>, java.util.function.BinaryOperator<U>);<br><br></li>
  <li>public static <T, K, U, M extends java.util.Map<K, U>> java.util.stream.Collector<T, ?, M> toMap(java.util.function.Function<? super T, ? extends K>, java.util.function.Function<? super T, ? extends U>, java.util.function.BinaryOperator<U>, java.util.function.Supplier<M>);<br><br></li>
  <li>public static <T, K, U> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, U>> toConcurrentMap(java.util.function.Function<? super T, ? extends K>, java.util.function.Function<? super T, ? extends U>);<br><br></li>
  <li>public static <T, K, U> java.util.stream.Collector<T, ?, java.util.concurrent.ConcurrentMap<K, U>> toConcurrentMap(java.util.function.Function<? super T, ? extends K>, java.util.function.Function<? super T, ? extends U>, java.util.function.BinaryOperator<U>);<br><br></li>
  <li>public static <T, K, U, M extends java.util.concurrent.ConcurrentMap<K, U>> java.util.stream.Collector<T, ?, M> toConcurrentMap(java.util.function.Function<? super T, ? extends K>, java.util.function.Function<? super T, ? extends U>, java.util.function.BinaryOperator<U>, java.util.function.Supplier<M>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.util.IntSummaryStatistics> summarizingInt(java.util.function.ToIntFunction<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.util.LongSummaryStatistics> summarizingLong(java.util.function.ToLongFunction<? super T>);<br><br></li>
  <li>public static <T> java.util.stream.Collector<T, ?, java.util.DoubleSummaryStatistics> summarizingDouble(java.util.function.ToDoubleFunction<? super T>);<br><br></li>
  </ol>