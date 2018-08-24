package org.githup.es.service;

import org.githup.es.common.GoodsInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * Created by brander on 2018/8/24
 */
@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo,Long> {
}
