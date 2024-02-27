package com.artifund.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artifund.entity.post.SubscribeEntity;
import com.artifund.entity.user.UserEntity;

@Repository
public interface SubscribeRepository extends JpaRepository<SubscribeEntity,Long>{
    SubscribeEntity addSubscribe(UserEntity subscriber, UserEntity subscribed);

    void deleteSubscribe(Long subscribeId);

    Optional<SubscribeEntity> findBySubscriberAndSubscribed(UserEntity subscriber, UserEntity subscribed);

    // Найти все подписки для подписчика 
    List<SubscribeEntity> findAllBySubscriber(UserEntity subscriber);

    Optional<SubscribeEntity> findBySubscribeAndSubscription(UserEntity userSubscription, UserEntity userSubscriber);
}
