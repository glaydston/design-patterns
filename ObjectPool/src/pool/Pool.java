/**
 * 
 */
package pool;

/**
 * @author glaydston
 *
 */
public interface Pool<T> {
	T acquire();
	void release(T t);
}
