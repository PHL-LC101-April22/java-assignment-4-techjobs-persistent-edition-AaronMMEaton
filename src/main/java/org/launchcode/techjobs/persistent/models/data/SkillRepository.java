package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * By AaronMMEaton
 */

@Repository
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}