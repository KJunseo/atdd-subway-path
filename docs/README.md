## 기능 요구사항

## Step1 로그인 기능

### 프론트엔드
- [x] member 생성 API
- [x] login API

### 벡엔드
- [x] 로그인(토큰 발급) 요청 처리

## Step2 회원 관리 기능

### 프론트엔드
- [x] member 데이터 조회
- [x] member 정보 update
- [x] member 삭제

### 백엔드
- [x] 유효한 로그인인 경우 LoginMember 만들어서 응답
- [x] 회원 조회
- [x] 회원 수정
- [x] 회원 삭제

## Step3 경로 조회 기능

### 프론트엔드
- [x] 모든 역을 불러오는 API
- [x] 최단 거리를 검색하는 API

### 백엔드
- [x] 경로조회 기능 구현
    - [x] 모든 Line을 가져오기
    - [x] 각 Line의 getStations를 통해 vertex 등록
    - [x] 각 Line의 getSections를 통해 edge 등록