# SoptSeminar

## Seminar week1

|전체 시연영상|로그인 화면|회원가입 화면|자기소개 화면|
|:---:|:---:|:---:|:---:|
|<img src="https://user-images.githubusercontent.com/64943924/162515554-0e9d6cfe-a164-4ef4-b183-f628c911da5d.gif" width=300/>|<img src="https://user-images.githubusercontent.com/64943924/162515232-d9010c51-7f04-4220-a5de-3637b942d772.png" width=300/>|<img src="https://user-images.githubusercontent.com/64943924/162515262-e4501c00-4acc-4b68-bff2-6fa1cbdb7925.png" width=300/>|<img src="https://user-images.githubusercontent.com/64943924/162515399-9aed0c97-00c6-4c53-9e01-ba6712f6337f.png" width=300/>|

### 구현한 사항
- 로그인 화면 (SignInActivity)
  - 로그인 버튼 클릭시 입력필드 유효성 검증
  - 유효성 검증 성공시 HomeActivity로 이동

- 회원가입 화면 (SignUpActivity)
  - 회원가입 완료 버튼 클릭시 입력필드 유효성 검증
  - 유효성 검증 성공시 이전 화면으로 이동

- 자기소개 화면 (HomeActivity)
  - ImageView, TextView 사용

## Seminar week2

|전체 시연영상|팔로워 목록|레포지토리 목록|
|:---:|:---:|:---:|
|<img src="https://user-images.githubusercontent.com/64943924/164006150-71830e7a-28a9-46bf-be8d-f0b2b7c23c2d.gif" width=300/>|<img src="https://user-images.githubusercontent.com/64943924/164005918-e1fb5867-8e8d-43a5-9434-eb1ed0c73253.png" width=300/>|<img src="https://user-images.githubusercontent.com/64943924/164005979-92c07917-f3fb-40ac-a8bc-91694af1a3ab.png" width=300/>|


### 구현한 사항
- Fragment Transaction
  - supportFragmentManager의 replace method 사용하여 선택한 버튼에 해당하는 fragment로 replace
  - default : FollowerFragment
- 팔로워 목록 (FollowerFragment)
  - LinearLayoutManager
  - ListAdapter 사용하여 데이터 추가, 삭제시 백그라운드에서 비교하여 처리할 수 있도록 구현

- 레포지토리 목록 (RepositoryFragment)
  - GridLayoutManager, span 2
  - ListAdapter 사용하여 데이터 추가, 삭제시 백그라운드에서 비교하여 처리할 수 있도록 구현
