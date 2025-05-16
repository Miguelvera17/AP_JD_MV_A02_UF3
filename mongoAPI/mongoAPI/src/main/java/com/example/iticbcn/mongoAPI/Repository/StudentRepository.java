package com.example.iticbcn.mongoAPI.Repository;

@Repository
@EnableReactiveMongoRepositories
public class StudentRepository extends ReactiveMongoRepository<Student, String>{
    
}
