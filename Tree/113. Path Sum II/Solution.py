class Solution:
    def pathSum(self, root: TreeNode, targetSum: int) -> List[List[int]]:
        ans = []
        if not root:
            return ans
        
        def dfs(node, path_till_now, sum_till_now):
            if not node.left and not node.right and sum_till_now + node.val == targetSum:
                ans.append(path_till_now + [node.val])
                return
            if node.left:
                dfs(node.left, path_till_now + [node.val], sum_till_now + node.val)
            if node.right:
                dfs(node.right, path_till_now + [node.val], sum_till_now + node.val)
        dfs(root, [], 0)
        return ans
