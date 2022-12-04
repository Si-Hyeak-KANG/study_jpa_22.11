package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // code
            // 비영속
            Member member = new Member();
            member.setId(3L);
            member.setName("HelloJPA");

            // 영속
            System.out.println("===BEFORE===");
            em.persist(member);
            System.out.println("===AFTER===");

            // 캐시에서 조회
            Member findMember = em.find(Member.class, 1L);
            System.out.println("findMember.getName() = " + findMember.getName());

            findMember.setName("editJpa");
            System.out.println("findMember.getName() = " + findMember.getName());

            em.persist(findMember);

            System.out.println("==================");
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
