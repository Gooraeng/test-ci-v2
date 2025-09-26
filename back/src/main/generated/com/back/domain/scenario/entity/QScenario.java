package com.back.domain.scenario.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScenario is a Querydsl query type for Scenario
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QScenario extends EntityPathBase<Scenario> {

    private static final long serialVersionUID = 1522211885L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScenario scenario = new QScenario("scenario");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.back.domain.node.entity.QDecisionLine decisionLine;

    public final StringPath description = createString("description");

    public final StringPath errorMessage = createString("errorMessage");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath img = createString("img");

    public final StringPath job = createString("job");

    public final com.back.domain.post.entity.QPost post;

    public final EnumPath<ScenarioStatus> status = createEnum("status", ScenarioStatus.class);

    public final StringPath summary = createString("summary");

    public final StringPath timelineTitles = createString("timelineTitles");

    public final NumberPath<Integer> total = createNumber("total", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedDate = createDateTime("updatedDate", java.time.LocalDateTime.class);

    public final com.back.domain.user.entity.QUser user;

    public QScenario(String variable) {
        this(Scenario.class, forVariable(variable), INITS);
    }

    public QScenario(Path<? extends Scenario> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScenario(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScenario(PathMetadata metadata, PathInits inits) {
        this(Scenario.class, metadata, inits);
    }

    public QScenario(Class<? extends Scenario> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.decisionLine = inits.isInitialized("decisionLine") ? new com.back.domain.node.entity.QDecisionLine(forProperty("decisionLine"), inits.get("decisionLine")) : null;
        this.post = inits.isInitialized("post") ? new com.back.domain.post.entity.QPost(forProperty("post"), inits.get("post")) : null;
        this.user = inits.isInitialized("user") ? new com.back.domain.user.entity.QUser(forProperty("user")) : null;
    }

}

