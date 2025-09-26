package com.back.domain.poll.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPollVote is a Querydsl query type for PollVote
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPollVote extends EntityPathBase<PollVote> {

    private static final long serialVersionUID = -186380779L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPollVote pollVote = new QPollVote("pollVote");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    public final StringPath choiceJson = createString("choiceJson");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final ComparablePath<java.util.UUID> pollUid = createComparable("pollUid", java.util.UUID.class);

    public final com.back.domain.post.entity.QPost post;

    public final com.back.domain.user.entity.QUser user;

    public final StringPath userHash = createString("userHash");

    public QPollVote(String variable) {
        this(PollVote.class, forVariable(variable), INITS);
    }

    public QPollVote(Path<? extends PollVote> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPollVote(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPollVote(PathMetadata metadata, PathInits inits) {
        this(PollVote.class, metadata, inits);
    }

    public QPollVote(Class<? extends PollVote> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.post = inits.isInitialized("post") ? new com.back.domain.post.entity.QPost(forProperty("post"), inits.get("post")) : null;
        this.user = inits.isInitialized("user") ? new com.back.domain.user.entity.QUser(forProperty("user")) : null;
    }

}

