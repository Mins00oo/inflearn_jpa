package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 등록
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("Hello");
//            em.persist(member);

            //조회
//            Member findMember = em.find(Member.class, 5L);
//            System.out.println("findMember.id=" + findMember.getId());
//            System.out.println("findMember.name=" + findMember.getName());
//            em.persist(findMember);

            //삭제
//            Member findMember = em.find(Member.class, 100L);
//            em.remove(findMember);

            //수정
//            Member findMember = em.find(Member.class, 2L);
//            findMember.setId(1L);

            //전체 조회
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .getResultList();
//
//            for (Member member : result){
//                System.out.println("member.name = " + member.getName());
//            }

            //예를 들어 범위 내의 조회
//            em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(5)
//                    .setMaxResults(8)
//                    .getResultList();
//            for (Member member : result){
//                System.out.println("member.name = " + member.getName());
//            }



            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();


    }
}
