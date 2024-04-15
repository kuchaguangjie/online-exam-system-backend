package cn.org.alan.exam.mapper;

import cn.org.alan.exam.model.entity.UserBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WeiJin
 * @since 2024-03-21
 */
public interface UserBookMapper extends BaseMapper<UserBook> {
    int addUserBookList(List<UserBook> userBookArrayList);
}
