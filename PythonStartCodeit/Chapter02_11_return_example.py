// 첫 예시
> def get_square(x):
> 	return x * x
>
> print(get_square(3))		// 여기서 get_square(3) 부분이 9가 된 후에 print로 9가 출력되는 것, 더 자세히 설명하자면
> // x에 3이 들어가고, 3 * 3 이 실행되어 print의 괄호 안에 9가 돌아가 9가 출력
>
>
> // 두번째 예시
> def get_square(x):
>	return x * x
>
> print(get_square(3) + get_square(4))
> // get_square(3)은 9로 값이 리턴되고 get_square(4)는 16으로 값이 리턴되어서 결국 print값은 25이다, 25가 출력된다.
> ```
