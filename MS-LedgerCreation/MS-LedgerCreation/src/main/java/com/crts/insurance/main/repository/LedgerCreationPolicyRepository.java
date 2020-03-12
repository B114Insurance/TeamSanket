package com.crts.insurance.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.insurance.main.entity.Policy;

@Repository
public interface LedgerCreationPolicyRepository extends CrudRepository<Policy, Integer>
{

	Policy findBypolicyNo(int policyNo);


}
